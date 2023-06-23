const axios = require('axios');

const urls = [
  'https://www.balldontlie.io/api/v1/players',
  'https://www.balldontlie.io/api/v1/teams',
  'https://www.balldontlie.io/api/v1/games',
  'https://www.balldontlie.io/api/v1/stats',
  'https://www.balldontlie.io/api/v1/season_averages'
];


const options = {
    method: 'GET',
    url: urls[1]
  };

const player_request = {
  method: 'GET',
  url: urls[0],
  parms: [
    {
      player_id: 0,
      page: 0,
      per_page: 0,
      search: ''
    }
  ]
};  
const teams_request = {
  method: 'GET',
  url: urls[1],
  parms: [
    {
      team_id: 0,
      page: 0,
      per_page: 0
    }
  ]
};

const games_request = {
method: 'GET',
url: urls[2],
parms: [
  {
    page: 0,
    per_page: 0,
    dates: 'YYYY-MM-DD',
    seasons: [],
    team_ids: [],
    postseason: false,
    start_date: 'YYYY-MM-DD',
    end_date: 'YYYY-MM-DD'
  }
]
};

const stats_request = {
  method: 'GET',
  url: urls[3],
  parms: [
    {
      page: 0,
      per_page: 0,
      dates: 'YYYY-MM-DD',
      seasons: [],
      player_ids: [],
      game_ids: [],
      postseason: false,
      start_date: 'YYYY-MM-DD',
      end_date: 'YYYY-MM-DD'
    }
  ]
};

const season_request = {
method: 'GET',
url: urls[4],
parms: [
  {
    season: '',
    player_ids: []
  }
]
}; 

/**
 * 1. Create custom request options for each url with each custom parameters
 * 2. Create custom async request options for each url
 * 3. Retreive response and save to Object
 * 
 * 
 *  */ 


// TEST - Asyn function to send request
async function asyncCall() {
    try {
        const response = await axios.request(player_request);
        console.log(response.data);
    } catch (error) {
        console.error(error);
    }
    // Expected output: "resolved"
  }
  
  asyncCall();